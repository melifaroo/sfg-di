package guru.springframework.sfgdi.repositories;

public class EnglishGreetingsRepositoryImpl implements EnglishGreetingRepository{
    @Override
    public String getGreeting() {
        return "Hello World - EN - from rep";
    }
}
