package com.shamy1st;

import com.shamy1st.command.AddCustomerCommand;
import com.shamy1st.command.app.CustomerService;
import com.shamy1st.command.framework.Button;
import com.shamy1st.command.framework.Command;

public class Main {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerService();
		Command command = new AddCustomerCommand(service);
		Button button = new Button(command);
		button.click();
	}
}
