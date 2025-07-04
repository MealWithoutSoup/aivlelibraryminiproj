package aivlelibraryminiproj.domain;

import aivlelibraryminiproj.domain.*;
import aivlelibraryminiproj.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class BookPublished extends AbstractEvent {

    private Long id;
    private Long authorId;
    private Long publicationId;
    private String contents;
    private String coverImageUrl;
    private String plot;
    private String status;
    private String category;
    private Integer subscriptionFee;
    private String plotUrl;
    private Long views;
    private Boolean isBest;
    private String title;
    private String authorName;

    public BookPublished(Book aggregate) {
        super(aggregate);
    }

    public BookPublished() {
        super();
    }
}
//>>> DDD / Domain Event
