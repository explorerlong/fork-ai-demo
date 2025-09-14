package com.mancode.ai.local;

import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;



@SpringBootApplication
public class LocalAgentApplication {
	public static void main(String[] args) {
		SpringApplication.run(LocalAgentApplication.class, args);
	}

}
