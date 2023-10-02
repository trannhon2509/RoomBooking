package com.bookingroom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Những cái có chữ @ gọi là anotation
// 3 dòng này được gọi là cú pháp lombok ae search cách sử dụng 
// Cái này giúp ae không cần viết constructor với getter setter nữa mà nó tự viết luôn
// Ae tạo lớp chỉ cần viết mấy cái attributes thôi còn lại 3 dòng này lặp lại
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private String studentId;
	private String studentName;
}
