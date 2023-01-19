package com.bbodeum.review.vo;

import java.util.Date;

import com.bbodeum.apply.vo.Apply;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Review {
	private Apply apply;
	private String revTitle;
	private String revContent;
	private Date revRegDate;
	private int revRate;
}
