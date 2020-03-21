package com.example.omegalotto.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {

            String text = "";

            switch (input)
            {
                case 1 :
                    // 이번 회차
                    text = "2020.01.01 581회 당첨번호";
                    break;
                case 2 :
                    // 검색
                    text = "검색";
                    break;
                case 3 :
                    // 추천
                    text = "오메가가 분석한 이번 주 추천 번호";
                    break;
            }

            return text;
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}