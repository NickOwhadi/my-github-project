package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="payment_details")
@Data
@NoArgsConstructor
public class PaymentDetail extends BaseEntity{

    private BigDecimal commisionAmount;
    private BigDecimal merchantPayoutAmount;
    private LocalDate payoutDate;
    @OneToOne(mappedBy = "paymentDetail")
    private Payment payment;

    public PaymentDetail(BigDecimal commisionAmount, BigDecimal merchantPayoutAmount, LocalDate payoutDate) {
        this.commisionAmount = commisionAmount;
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.payoutDate = payoutDate;
    }
}
