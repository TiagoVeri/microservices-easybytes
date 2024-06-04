package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoanDTO;

public interface ILoanService {

    void createLoan(String mobileNumber);
    LoanDTO fetchLoan(String mobileNumber);

    boolean updateLoan(LoanDTO loanDTO);

    boolean deleteLoan(String mobileNumber);
}
