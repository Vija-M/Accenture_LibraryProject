package com.libraryproject.libraryProject.domain;

import java.util.Date;
import java.util.List;

public class Orders {
    private int orderID;
    private int userID;
    private List<Books> BookIdList;
    private Date issueDate;
    private Date returnDate;
    private OrderStatus orderInfo;

    public Orders() {
    }

    public Orders(int orderID, int userID, List<Books> bookIdList, Date issueDate, Date returnDate, OrderStatus orderInfo) {
        this.orderID = orderID;
        this.userID = userID;
        BookIdList = bookIdList;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.orderInfo = orderInfo;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<Books> getBookIdList() {
        return BookIdList;
    }

    public void setBookIdList(List<Books> bookIdList) {
        BookIdList = bookIdList;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public OrderStatus getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(OrderStatus orderInfo) {
        this.orderInfo = orderInfo;
    }
}
