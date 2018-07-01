package EB.EmployeeBackEnd;



import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

@Configuration
public class DataBaseConfiguration {

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
	BasicDataSource dataSource = new BasicDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/emp");
	dataSource.setUsername("sa");
	dataSource.setPassword("");
	return dataSource;
	}
	
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory sessionFactory() {
	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getDataSource());
	sessionBuilder.scanPackages("com.employeebackend.model");
	sessionBuilder.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	sessionBuilder.setProperty("hibernate.hbm2ddl.auto", "update");
	sessionBuilder.setProperty("hibernate.show_sql", "true");
	return sessionBuilder.buildSessionFactory();
	 }
	
	}


