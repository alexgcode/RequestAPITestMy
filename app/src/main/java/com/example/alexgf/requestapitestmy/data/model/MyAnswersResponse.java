package com.example.alexgf.requestapitestmy.data.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MyAnswersResponse {

    @SerializedName("expenses")
    @Expose
    private List<Expense> expenses = null;

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

}