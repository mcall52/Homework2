import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Michael on 2/3/2017.
 */

public class SnowmanView extends View {
    private Paint snowmanPaint;
    private static int snowmanColor = Color.BLACK;

    private void init() {
        snowmanPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        snowmanPaint.setColor();

        //create a few Paint objects

    }

    //Layout

    //Draw shapes
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //Draw bottom
        canvas.drawCircle(bottomx, bottomy, bottomSize, snowmanPaint);

        //draw middle
        canvas.drawCircle(middlex, middley, middleSize, snowmanPaint);

        //draw head
        canvas.drawCircle(headx, heady, headSize, snowmanPaint);

    }
}
