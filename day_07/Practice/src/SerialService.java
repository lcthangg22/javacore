public class SerialService {
    public Serial[] getSerials() {
        Serial[] serials = {
                new Serial(1, "D", "Hài kịch", "d", 1, 2, 20),
                new Serial(2, "E", "Hành động", "e", 2, 4, 40),
                new Serial(3, "F", "Khoa học viễn tưởng", "f", 3, 6, 60),
        };
        return serials;
    }

    public void findByTitle(String title) {
        int count = 0;
        for (Serial serial : getSerials()) {
            if(serial.getTitle().contains(title)) {
                count++;
                System.out.println(serial);
            }
        }
        if(count == 0) {
            System.out.println("Không có sách phù hợp với title là : " + title);
        }
    }
}
