public class EducationalCourseSystem {
    public static void main(String[] args) {

        Course course = new Course("Data Structures", 12);
        OnlineCourse onlineCourse =
                new OnlineCourse("Algorithms", 10, "Coursera", true);
        PaidOnlineCourse paidCourse =
                new PaidOnlineCourse("Machine Learning", 16, "Udemy", true, 4999, 20);

        System.out.println(course.getCourseDetails());
        System.out.println(onlineCourse.getCourseDetails());
        System.out.println(paidCourse.getCourseDetails());
    }
}
class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration; // week
    }

    public String getCourseDetails() {
        return "Course: " + courseName +
               ", Duration: " + duration + " weeks";
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration,
                        String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() +
               ", Platform: " + platform +
               ", Recorded: " + isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    // percent discount
    double discount;

    public PaidOnlineCourse(String courseName, int duration,
                            String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public String getCourseDetails() {
        double finalFee = fee - (fee * discount / 100);
        return super.getCourseDetails() +
               ", Fee: " + fee +
               ", Discount: " + discount + "%" +
               ", Final Fee: " + finalFee;
    }
}
