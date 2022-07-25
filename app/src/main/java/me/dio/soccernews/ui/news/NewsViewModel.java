package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        // TODO remover mock de notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviária tem desfalques importantes", "Lorem Ipsum is simply dummy text of the printing and typesetting industry"));
        news.add(new News("Ferrinha joga no sábado", "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book"));
        news.add(new News("Copa do Mundo feminina está terminando", "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged"));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}