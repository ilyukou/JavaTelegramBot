package bot.main;

public class Provide {
    static UserRep provide(){
        if(true){
            return HashSetUserRepository.returnUserRepository();
        }else{
            return MockUserRepository.returnUserRepository();
        }
    }
}
