package dev.ousmane.streamsschedule.model;

import java.time.LocalDate;
import java.util.Objects;

public class MutableLiveStream {
    private String id;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public MutableLiveStream() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableLiveStream that = (MutableLiveStream) o;
        return id.equals(that.id) && title.equals(that.title) && description.equals(that.description) && startDate.equals(that.startDate) && endDate.equals(that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, startDate, endDate);
    }

    @Override
    public String toString() {
        return "MutableLiveStream{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
