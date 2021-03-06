package com.payroll.odr.dto;

import lombok.Data;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Data
public class MyPageable {

    private Integer page;
    private Integer size;
    private String sort = "asc";
    private String sortBy = "id";

    public static Pageable convertToPageable(MyPageable myPageable) {
        if (myPageable != null) {
            int page;
            if (myPageable.getPage() != null) {
                if (myPageable.getPage() == 0) {
                    page = 0;
                } else {
                    page = myPageable.getPage() - 1;
                }
            } else {
                page = 0;
            }

            int size;
            if (myPageable.getSize() != null) {
                size = myPageable.getSize();
            } else {
                size = 20;
            }

            if(myPageable.getSortBy() != null) {
                if(myPageable.getSort().toLowerCase().equals("asc")){
                    return PageRequest.of(page, size, Sort.by(Sort.Direction.ASC, myPageable.getSortBy()));
                }

                return PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, myPageable.getSortBy() ));
            }

            return PageRequest.of(page, size);
        } else {
            if(myPageable.getSortBy() != null) {
                if(myPageable.getSort().toLowerCase().equals("asc")){
                    return PageRequest.of(0, 20, Sort.by(Sort.Direction.ASC, myPageable.getSortBy()));
                }

                return PageRequest.of(0, 20, Sort.by(Sort.Direction.DESC, myPageable.getSortBy() ));
            }
            return PageRequest.of(0, 20);
        }
    }

}
