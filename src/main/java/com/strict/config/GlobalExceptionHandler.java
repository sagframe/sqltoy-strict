package com.strict.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.strict.framework.model.Result;
import com.strict.framework.model.ResultCode;

/**
 * @description 全局异常处理器
 * @author zhongxuchen
 * @version v1.0, Date:2022-8-30
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(value = { RuntimeException.class, Exception.class })
	public Result defaultException(Exception e) {
		e.printStackTrace();
		logger.error("defaultException 异常:{},={}", e.getMessage(), e);
		return Result.error(ResultCode.ERROR, e.getMessage());
	}

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public Result handleException(MethodArgumentNotValidException e) {
		e.printStackTrace();
		logger.error("MethodArgumentNotValidException 异常:{},={}", e.getMessage(), e);
		return Result.error(ResultCode.ARG_NOT_VALID, e.getBindingResult().getFieldError().getDefaultMessage());
	}

	@ExceptionHandler(MultipartException.class)
	public Result MultipartException(MultipartException e, RedirectAttributes redirectAttributes) {
		e.printStackTrace();
		logger.error("MultipartException 异常:{},={}", e.getMessage(), e);
		return Result.error(ResultCode.MULTI_ERROR, e.getMessage());
	}
}
