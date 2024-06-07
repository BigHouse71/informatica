package it.edu.iisgubbio.animazione;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PongGame extends Application {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final int PADDLE_WIDTH = 10;
    private static final int PADDLE_HEIGHT = 60;
    private static final int BALL_RADIUS = 15;

    private double paddleSpeed = 5;
    private double ballSpeedX = 2;
    private double ballSpeedY = 2;

    private Rectangle leftPaddle;
    private Rectangle rightPaddle;
    private Circle ball;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        // Left Paddle
        leftPaddle = new Rectangle(10, HEIGHT / 2 - PADDLE_HEIGHT / 2, PADDLE_WIDTH, PADDLE_HEIGHT);
        leftPaddle.setFill(Color.WHITE);

        // Right Paddle
        rightPaddle = new Rectangle(WIDTH - 20, HEIGHT / 2 - PADDLE_HEIGHT / 2, PADDLE_WIDTH, PADDLE_HEIGHT);
        rightPaddle.setFill(Color.WHITE);

        // Ball
        ball = new Circle(WIDTH / 2, HEIGHT / 2, BALL_RADIUS, Color.WHITE);

        root.getChildren().addAll(leftPaddle, rightPaddle, ball);

        // Handle paddle movement
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP && rightPaddle.getY() > 0) {
                rightPaddle.setY(rightPaddle.getY() - paddleSpeed);
            } else if (e.getCode() == KeyCode.DOWN && rightPaddle.getY() < HEIGHT - PADDLE_HEIGHT) {
                rightPaddle.setY(rightPaddle.getY() + paddleSpeed);
            }
        });

        // Create animation timeline
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(10), event -> updateGame()));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        primaryStage.setTitle("Pong Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateGame() {
        // Move ball
        ball.setCenterX(ball.getCenterX() + ballSpeedX);
        ball.setCenterY(ball.getCenterY() + ballSpeedY);

        // Ball collisions with walls
        if (ball.getCenterX() - BALL_RADIUS < 0 || ball.getCenterX() + BALL_RADIUS > WIDTH) {
            ballSpeedX = -ballSpeedX;
        }

        if (ball.getCenterY() - BALL_RADIUS < 0 || ball.getCenterY() + BALL_RADIUS > HEIGHT) {
            ballSpeedY = -ballSpeedY;
        }

        // Ball collisions with paddles
        if (ball.getBoundsInParent().intersects(leftPaddle.getBoundsInParent()) ||
                ball.getBoundsInParent().intersects(rightPaddle.getBoundsInParent())) {
            ballSpeedX = -ballSpeedX;
        }

        // AI for the left paddle
        if (leftPaddle.getY() + PADDLE_HEIGHT / 2 < ball.getCenterY() && leftPaddle.getY() < HEIGHT - PADDLE_HEIGHT) {
            leftPaddle.setY(leftPaddle.getY() + paddleSpeed);
        } else if (leftPaddle.getY() + PADDLE_HEIGHT / 2 > ball.getCenterY() && leftPaddle.getY() > 0) {
            leftPaddle.setY(leftPaddle.getY() - paddleSpeed);
        }
    }

    public static void main1(String[] args) {
        launch(args);
    }
}


