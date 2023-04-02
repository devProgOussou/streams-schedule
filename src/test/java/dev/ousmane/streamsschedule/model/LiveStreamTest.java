package dev.ousmane.streamsschedule.model;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class MutableLiveStreamTest {

    @Test
    void testEquals() {
        // Create two identical streams and assert that they are equal
        MutableLiveStream stream1 = new MutableLiveStream();
        stream1.setId("1");
        stream1.setTitle("Stream Title");
        stream1.setDescription("Stream Description");
        stream1.setStartDate(LocalDate.of(2023, 4, 1));
        stream1.setEndDate(LocalDate.of(2023, 4, 2));
        MutableLiveStream stream2 = new MutableLiveStream();
        stream2.setId("1");
        stream2.setTitle("Stream Title");
        stream2.setDescription("Stream Description");
        stream2.setStartDate(LocalDate.of(2023, 4, 1));
        stream2.setEndDate(LocalDate.of(2023, 4, 2));
        assertEquals(stream1, stream2);
    }

    @Test
    void testNotEquals() {
        // Create two streams with different ids and assert that they are not equal
        MutableLiveStream stream1 = new MutableLiveStream();
        stream1.setId("1");
        stream1.setTitle("Stream Title");
        stream1.setDescription("Stream Description");
        stream1.setStartDate(LocalDate.of(2023, 4, 1));
        stream1.setEndDate(LocalDate.of(2023, 4, 2));
        MutableLiveStream stream2 = new MutableLiveStream();
        stream2.setId("2");
        stream2.setTitle("Stream Title");
        stream2.setDescription("Stream Description");
        stream2.setStartDate(LocalDate.of(2023, 4, 1));
        stream2.setEndDate(LocalDate.of(2023, 4, 2));
        assertNotEquals(stream1, stream2);
    }

    @Test
    void testHashCode() {
        // Create a stream and assert that its hashCode is correct
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId("1");
        stream.setTitle("Stream Title");
        stream.setDescription("Stream Description");
        stream.setStartDate(LocalDate.of(2023, 4, 1));
        stream.setEndDate(LocalDate.of(2023, 4, 2));
        int expectedHashCode = stream.getId().hashCode() + stream.getTitle().hashCode() + stream.getDescription().hashCode()
                + stream.getStartDate().hashCode() + stream.getEndDate().hashCode();
        assertEquals(expectedHashCode, stream.hashCode());
    }

    @Test
    void testToString() {
        // Create a stream and assert that its toString method returns the expected value
        MutableLiveStream stream = new MutableLiveStream();
        stream.setId("1");
        stream.setTitle("Stream Title");
        stream.setDescription("Stream Description");
        stream.setStartDate(LocalDate.of(2023, 4, 1));
        stream.setEndDate(LocalDate.of(2023, 4, 2));
        String expectedToString = "MutableLiveStream{id='1', title='Stream Title', description='Stream Description', " +
                "startDate=2023-04-01, endDate=2023-04-02}";
        assertEquals(expectedToString, stream.toString());
    }
}