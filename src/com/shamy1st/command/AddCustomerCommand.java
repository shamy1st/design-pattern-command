package com.shamy1st.command;

import com.shamy1st.command.app.CustomerService;
import com.shamy1st.command.framework.Command;

public class AddCustomerCommand implements Command {
	
	private CustomerService customerService;
	
	public AddCustomerCommand(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@Override
	public void execute() {
		this.customerService.addCustomer();
	}
}
