package shopAdminTest.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity //获得了springSecurityFilterChain组件
@EnableGlobalMethodSecurity(prePostEnabled=true)//开启方法级别权限检查支持  @(PreAuthorize)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()//配置页面授权
			.antMatchers("/login").permitAll()//允许所有用户访问
			.antMatchers("/**").authenticated()//其他页面仅限于用户登录访问
			.and()
			.formLogin()//配置表单登录
			.loginPage("/login")//登录路径
			.defaultSuccessUrl("/");//默认的登录成功页面
	}*/
	//默认所有要求都需要登录
	//这是手动添加的
	@Bean
	public UserDetailsService uds(){
		//提供用户详情,用于检查登录的账号和密码
		InMemoryUserDetailsManager im=new InMemoryUserDetailsManager();
		//创建检查用户
		im.createUser(User.withUsername("zs")
				.password("$2a$10$pyhoz7k3QLux1jrJmuE.ZOenAbfrGpa8cSMYa4xs9reYaDsUyXsfG")
				.authorities("打酱油").build());
		return im;
		    
	}
	
}
