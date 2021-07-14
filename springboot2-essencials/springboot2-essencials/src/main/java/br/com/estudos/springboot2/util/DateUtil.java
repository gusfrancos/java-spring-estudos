package br.com.estudos.springboot2.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component
public class DateUtil {
	public String formatLocalDateTimeYoDataBaseStyle(LocalDateTime localDateTime) {
		return DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss").format(localDateTime);
		
	}
}
