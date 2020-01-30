package pe.gob.mininter.msdatamaestra;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsDatamaestraApplication {
	
	@Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozerBean() {
        return new DozerBeanMapper();
    }

	public static void main(String[] args) {
		SpringApplication.run(MsDatamaestraApplication.class, args);
	}

}
