package com.bbodeum.dog.vo;

import com.bbodeum.member.vo.Member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Dog {
	private int dogId;
	private Member member;	//db: dog_mem_id
	private String dogName;
}
