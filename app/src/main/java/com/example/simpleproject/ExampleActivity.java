import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ExampleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Criar um LinearLayout
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setPadding(16, 16, 16, 16);
        linearLayout.setGravity(Gravity.CENTER);

        // Criar um ImageView
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(200, 100));
        imageView.setImageResource(R.drawable.banner);
        imageView.setContentDescription(getString(R.string.example_image_desc));

        // Criar um TextView para o título
        TextView titleTextView = new TextView(this);
        titleTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        titleTextView.setText(R.string.example_title);
        titleTextView.setTextSize(24);
        titleTextView.setPadding(0, 16, 0, 0); // margem superior

        // Criar um TextView para a descrição
        TextView descriptionTextView = new TextView(this);
        descriptionTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        descriptionTextView.setText(R.string.example_description);
        descriptionTextView.setPadding(0, 8, 0, 0); // margem superior

        // Criar um Button
        Button backButton = new Button(this);
        backButton.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        backButton.setText("Back");
        backButton.setPadding(0, 16, 0, 0); // margem superior
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Finaliza a Activity
            }
        });

        // Adicionar as views ao LinearLayout
        linearLayout.addView(imageView);
        linearLayout.addView(titleTextView);
        linearLayout.addView(descriptionTextView);
        linearLayout.addView(backButton);

        // Definir o LinearLayout como o conteúdo da Activity
        setContentView(linearLayout);
    }
}