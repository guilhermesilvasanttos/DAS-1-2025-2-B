package br.univille.microkernel_kernel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class MicrokernelKernelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrokernelKernelApplication.class, args);
	}

}
