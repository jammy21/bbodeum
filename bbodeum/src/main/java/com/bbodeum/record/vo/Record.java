package com.bbodeum.record.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Record {
	private int rcDogId;
	private int rcProgId;
	private String rcContent;
}