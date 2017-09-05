package cn.onlyloveyd.recyclerviewgallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GalleryActivity extends AppCompatActivity {

    @BindView(R.id.rv_content)
    RecyclerView mRvContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        ButterKnife.bind(this);

        LinearLayoutManager llm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        CardAdapter cardAdapter = new CardAdapter(this);
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper();

        mRvContent.setLayoutManager(llm);
        mRvContent.setAdapter(cardAdapter);
        linearSnapHelper.attachToRecyclerView(mRvContent);
    }
}
