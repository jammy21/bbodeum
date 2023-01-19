package com.bbodeum.apply.vo;

import java.util.Date;
import java.util.List;

import com.bbodeum.dog.vo.Dog;
import com.bbodeum.keyword.vo.Keyword;
import com.bbodeum.program.vo.Program;
import com.bbodeum.record.vo.Record;
import com.bbodeum.trainer.vo.Trainer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor

public class Apply {
	private Dog dog;	//db: apply_dog_id
	private Program program;	//db: apply_prog_id
	private int applyStatus;
	private Date applyDate;
	private Record record;	//db: x

	@Override
	public String toString() {
		return "Apply [dog=" + dog + ", applyStatus=" + applyStatus + ", applyDate=" + applyDate + ", record=" + record
				+ "]";
	}
}
