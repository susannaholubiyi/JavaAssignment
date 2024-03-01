package diary;

import diary.exception.DiaryIsLockedException;

import java.util.ArrayList;

public class Diaries {
    public static ArrayList<Diary> diaries = new ArrayList<>();
    public static void add(String userName, String password){
        Diary diary = new Diary(userName, password);
        diaries.add(diary);
    }
    public Diary findDiary(String userName){
        for(Diary diary : diaries){
            if(diary.getUserName().equals(userName)){
                return diary;
            }
        }
        throw new DiaryIsLockedException("Diary does not exist");
    }
    public Diary findDiary(String userName, String password){
        for(Diary diary : diaries){
            boolean condition = diary.getUserName().equals(userName) && diary.getPassword().equals(password);
            if(condition){
                return diary;
            }
        }
        throw new DiaryIsLockedException("Diary does not exist");
    }
    public void deleteDiary(String userName, String password){
        Diary foundDiary = findDiary(userName,password);
        diaries.remove(foundDiary);
    }
    public static int size(){
        return diaries.size();
    }
}