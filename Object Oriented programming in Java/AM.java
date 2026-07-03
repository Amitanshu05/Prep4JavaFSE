
class StudentProfile {
    // 1. PUBLIC: Koi bhi access kar sakta hai, kahin se bhi.
    public String name = "Amitanshu";
    
    // 2. PROTECTED: Same package mein sabko milega, aur dusre package ke children ko.
    protected String college = "VIT Bhopal";
    
    // 3. DEFAULT (No keyword): Sirf same package ke log dekh sakte hain.
    int currentSemester = 9;
    
    // 4. PRIVATE: Sabse strict. Sirf is 'StudentProfile' class ke andar use hoga.
    private double cgpa = 8.96;

    // Private variable ko bahar access karwane ke liye hum ek PUBLIC method banate hain.
    // Isey OOPs ki bhasha mein "Encapsulation" kehte hain.
    public double getCgpa() {
        return cgpa;
    }
}

public class AM {
    public static void main(String[] args) {
        // Object instantiate kiya
        StudentProfile profile = new StudentProfile();

        System.out.println("--- Access Specifiers Test ---");

        // ✅ PUBLIC: Aaram se print hoga
        System.out.println("Name (Public): " + profile.name);

        // ✅ PROTECTED: Aaram se print hoga kyunki dono classes same file/package mein hain
        System.out.println("College (Protected): " + profile.college);

        // ✅ DEFAULT: Aaram se print hoga (same package)
        System.out.println("Semester (Default): " + profile.currentSemester);

        // ❌ PRIVATE: Agar tu niche wali line ko uncomment karega, toh laal error aayega!
        // System.out.println("CGPA (Private): " + profile.cgpa); 

        // ✅ PRIVATE via PUBLIC METHOD: Sahi tareeqa private data read karne ka
        System.out.println("CGPA (Accessed via Public Method): " + profile.getCgpa());
    }
}
