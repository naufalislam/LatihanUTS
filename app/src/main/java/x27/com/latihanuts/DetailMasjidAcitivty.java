package x27.com.latihanuts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMasjidAcitivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_masjid);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Masjid masjid = getIntent().getParcelableExtra("key");

        ImageView gamabar = (ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);
        TextView lahir = (TextView)findViewById(R.id.content_lahir);
        TextView pendiri = (TextView)findViewById(R.id.content_pendiri);

        Glide.with(this).load(masjid.getPhoto()).override(350,550).into(gamabar);
        name.setText(masjid.getName());
        remarks.setText(masjid.getRemarks());
        deskripsi.setText(masjid.getDeskripsi());
        lahir.setText(masjid.getLahir());
        pendiri.setText(masjid.getWafat());

        Log.i("photo", masjid.getPhoto());
        Log.i("deskripsi", masjid.getDeskripsi());
    }
}
