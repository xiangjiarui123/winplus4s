package com.demo.pojo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="subject_bbin_purchase_record")
public class SubjectBbinPurchaseRecord {
	//
	private Long id;
	//流水号
	private String serialNumber;
	//购买金额
	private BigDecimal amount;
	//交易ip
	private String dealIp;
	//标的Id
	private Subject subject;
	//
	private Long memberId;
	//
	private Integer delflag;
	//
	private Date createDate;
	//
	private Date updateDate;
	//结算利息
	private BigDecimal interest;
	//是否还款
	private Integer ispayment;
	//
	private Integer payInterestTimes;
	//最后计息日
	private Integer lastProfitDay;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber == null ? null : serialNumber.trim();
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getDealIp() {
		return dealIp;
	}

	public void setDealIp(String dealIp) {
		this.dealIp = dealIp == null ? null : dealIp.trim();
	}

	@ManyToOne
	@JoinColumn(name="subject_id")
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Integer getDelflag() {
		return delflag;
	}

	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	public Integer getIspayment() {
		return ispayment;
	}

	public void setIspayment(Integer ispayment) {
		this.ispayment = ispayment;
	}

	public Integer getPayInterestTimes() {
		return payInterestTimes;
	}

	public void setPayInterestTimes(Integer payInterestTimes) {
		this.payInterestTimes = payInterestTimes;
	}

	public Integer getLastProfitDay() {
		return lastProfitDay;
	}

	public void setLastProfitDay(Integer lastProfitDay) {
		this.lastProfitDay = lastProfitDay;
	}
}