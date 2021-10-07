import java.time.LocalDate;

public class program {
    public static void main(String[] args) {
        

                                                        //Insert Department :

        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Technical";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Finance";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Human Resouces";

                                                        // Insert Position :

        Position position1 = new Position();
        position1.id = 1;
        position1.name = "Dev";

        Position position2 = new Position();
        position2.id = 2;
        position2.name = "Tester";

        Position position3 = new Position();
        position3.id = 3;
        position3.name = "BrSE";

                                                        // Insert Account :
        
        Account account1 = new Account();
        account1.id = 1;
        account1.email = "account1@vtiacademy.com";
        account1.username = "vti1";
        account1.fullName = "Nguyen Van Tinh";
        account1.department = department1;
        account1.position = position1 ;
        account1.createDate = LocalDate.ofEpochDay(2019-12-01);

        Account account2 = new Account();
        account2.id = 2;
        account2.email = "account2@vtiacademy.com";
        account2.username = "vti2";
        account2.fullName = "Trinh Hoai Linh";
        account2.department = department1;
        account2.position = position2 ;
        account2.createDate = LocalDate.ofEpochDay(2020-12-01);

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "account3@vtiacademy.com";
        account3.username = "vti3";
        account3.fullName = "Nguyen Van Test";
        account3.department = department1;
        account3.position = position1 ;
        account3.createDate = LocalDate.ofEpochDay(2020-07-01);

                                                        // Insert Group :

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Nhom 1";
        group1.creator = account3;
        group1.createDate = LocalDate.ofEpochDay(2021-04-03);     
        
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Nhom 2";
        group2.creator = account3;
        group2.createDate = LocalDate.ofEpochDay(2019-01-03); 

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Nhom 3";
        group3.creator = account2;
        group3.createDate = LocalDate.ofEpochDay(2020-04-03); 

                                                        // Group Account :
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.group = group1 ; 
        groupAccount1.account = account1;
        groupAccount1.joinDate = LocalDate.ofEpochDay(2021-06-01);

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.group = group1 ; 
        groupAccount2.account = account3;
        groupAccount2.joinDate = LocalDate.ofEpochDay(2020-01-01);

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.group = group1 ; 
        groupAccount3.account = account2;
        groupAccount3.joinDate = LocalDate.now();

                                                        // Insert Type Question :

        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.id = 1;
        typeQuestion1.name = "Trac Nghiem";

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.id = 2;
        typeQuestion2.name = "Tu Luan";

        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion3.id = 3;
        typeQuestion3.name = "Ket hop trac nghiem va tu luan";

                                                        // Insert Category Question :

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.id = 1;
        categoryQuestion1.name = "Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.id = 2;
        categoryQuestion2.name = "SQL";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.id = 3;
        categoryQuestion3.name = "HTML";


                                                         // Insert Question

        Question question1 = new Question();
        question1.id = 1;
        question1.content = "Câu hỏi SQL";
        question1.category = categoryQuestion2;
        question1.type = typeQuestion2;
        question1.creator = account1;
        question1.createDate = LocalDate.ofEpochDay(2021-04-01); 
        
        Question question2 = new Question();
        question2.id = 2;
        question2.content = "Câu hỏi Java";
        question2.category = categoryQuestion1;
        question2.type = typeQuestion1;
        question2.creator = account3;
        question2.createDate = LocalDate.ofEpochDay(2021-07-01);                                              

        Question question3 = new Question();
        question3.id = 3;
        question3.content = "Câu hỏi HTML";
        question3.category = categoryQuestion3;
        question3.type = typeQuestion1;
        question3.creator = account2;
        question3.createDate = LocalDate.now();    
        
                                                        // Insert Answer :

        Answer answer1 = new Answer();
        answer1.id = 1 ;
        answer1.content = "Câu trả lời 1";
        answer1.question = question1;
        answer1.isCorect = true;

        Answer answer2 = new Answer();
        answer2.id = 2 ;
        answer2.content = "Câu trả lời 2";
        answer2.question = question1;
        answer2.isCorect = false;

        Answer answer3 = new Answer();
        answer3.id = 3 ;
        answer3.content = "Câu trả lời 3";
        answer3.question = question1;
        answer3.isCorect = false;


                                                        // Insert Exam :

        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code ="MS01";
        exam1.title = "De thi 1";
        exam1.category = categoryQuestion1;
        exam1.duration = 90;
        exam1.creator = account1;
        exam1.createDate = LocalDate.now();

        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code ="MS02";
        exam2.title = "De thi 2";
        exam2.category = categoryQuestion1;
        exam2.duration = 60;
        exam2.creator = account3;
        exam2.createDate = LocalDate.now();

        Exam exam3 = new Exam();
        exam3.id = 3;
        exam3.code ="MS03";
        exam3.title = "De thi 3";
        exam3.category = categoryQuestion2;
        exam3.duration = 60;
        exam3.creator = account2;
        exam3.createDate = LocalDate.now();

                                                        // Insert Exam Question : 

        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.exam = exam1;
        examQuestion1.question = question1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.exam = exam2;
        examQuestion2.question = question1;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.exam = exam3;
        examQuestion3.question = question1;

    }
}
