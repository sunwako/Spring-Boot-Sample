package sample.service;

import org.springframework.stereotype.Service;

@Service		//元からインポートされている(DIは基本的にインポートされていえう)
public class HelloService {

	public String hello() {

		return "Hello, Spring DI !!";
	}

}
