package flexjoy.newod.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import java.util.Locale;

/**
 * @author Sergey Cherepanov on 29.04.2016.
 */

@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

	@Bean
	public LocaleResolver localeResolver() {
		CookieLocaleResolver clr = new CookieLocaleResolver();
		clr.setDefaultLocale(new Locale("ru"));
		clr.setCookieName("BACKEND_LOCALE");
		clr.setCookieMaxAge(3600*24*365*10); // cookie lifetime 10 years
		return clr;
	}
}
