//package edu.drexel.TrainDemo.configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
//import org.springframework.web.servlet.view.tiles3.TilesView;
//import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
//
//@SuppressWarnings("deprecation")
//@Configuration
//@EnableWebMvc
//public class Mvcconfiguration extends WebMvcConfigurerAdapter {
//
//	@Bean
//	public TilesConfigurer tilesConfigurer() {
//		TilesConfigurer tilesConfigurer = new TilesConfigurer();
//		tilesConfigurer.setDefinitions("/WEB-INF/tiles/tiles-admin.xml", "/WEB-INF/tiles/tiles-shop.xml");
//		tilesConfigurer.setCheckRefresh(true);
//		return tilesConfigurer;
//	}
//
//	/** Configure ViewResolvers to deliver preferred views. */
//	@Bean
//	public TilesViewResolver tilesViewResolver() {
//		final TilesViewResolver resolver = new TilesViewResolver();
//		resolver.setViewClass(TilesView.class);
//		resolver.setOrder(0);
//		return resolver;
//	}
//
//}
