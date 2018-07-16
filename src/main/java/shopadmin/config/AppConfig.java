package shopadmin.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("shop-admin")
@EnableWebMvc
// �?启web mvc基础设施支持
@MapperScan("shop-admin.mapper")
// 扫描指定包下的mapper
@PropertySource("classpath:jdbc.properties")
@EnableTransactionManagement
// �?始spring事务支持
public class AppConfig extends WebMvcConfigurerAdapter {
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// TODO Auto-generated method stub
		// author-list -> /WEB-INF/jsp/author-list.jsp
		// 对于控制器方法返回的字符串，会用以下规则解析成jsp路径，然后forward
		// 前缀 + 返回字符�? + 后缀 = jsp路径
		// 前缀 后缀
		registry.jsp("/WEB-INF/jsp/", ".jsp");
	}

	@Bean
	// 配置数据�?
	public DataSource ds(Environment env) {
		DriverManagerDataSource dmd = new DriverManagerDataSource(
				env.getProperty("jdbc.url"), env.getProperty("jdbc.username"),
				env.getProperty("jdbc.password"));
		dmd.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		return dmd;
	}

	@Bean
	// 定义会话工厂
	public SqlSessionFactoryBean sql(DataSource ds) {
		SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
		sfb.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		sfb.setDataSource(ds);
		return sfb;
	}

	@Bean
	// 定义密码
	public PasswordEncoder pe() {
		return new BCryptPasswordEncoder();
	}

	// spring事务�?要事务管理器组件（开事务、提交或回滚事务�?
	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		// 以下是能与mybatis协作的实现类，如用的是hibernate或JPA，那么实现类不一�?
		return new DataSourceTransactionManager(dataSource);
	}
}
