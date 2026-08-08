import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class ChatGUI extends JFrame {

    private JPanel chatPanel;
    private JScrollPane scrollPane;

    private JTextField inputField;

    private JButton sendButton;
    private JButton clearButton;
    private JButton exitButton;
    private JLabel questionCountLabel;
    private int totalQuestions = 0;

    private ChatBot bot;

    public ChatGUI() {

        bot = new ChatBot();

        initializeUI();

        setVisible(true);

    }

    private void initializeUI() {

        setTitle("Artificial Intelligence Chatbot");

        setSize(950,650);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        getContentPane().setBackground(new Color(240,242,245));

                // ================= HEADER =================

        JPanel header = new JPanel(new BorderLayout());

header.setBackground(new Color(20,32,56));

header.setBorder(new EmptyBorder(15,20,15,20));

JPanel titlePanel = new JPanel();

titlePanel.setBackground(new Color(20,32,56));

titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));

JLabel title = new JLabel(
        "Artificial Intelligence Chatbot",
        SwingConstants.CENTER);

title.setAlignmentX(Component.CENTER_ALIGNMENT);

title.setFont(new Font("Segoe UI", Font.BOLD, 30));

title.setForeground(Color.WHITE);

JLabel subtitle = new JLabel(
        "Smart Java NLP Assistant");

subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);

subtitle.setFont(new Font("Segoe UI", Font.PLAIN, 15));

subtitle.setForeground(new Color(210,210,210));

titlePanel.add(title);

titlePanel.add(Box.createVerticalStrut(5));

titlePanel.add(subtitle);



        JPanel rightPanel = new JPanel();

        rightPanel.setBackground(new Color(25,35,60));

        rightPanel.setLayout(new BoxLayout(rightPanel,BoxLayout.Y_AXIS));



        JLabel status = new JLabel("ONLINE");

        status.setForeground(new Color(0,255,120));

        status.setFont(new Font("Segoe UI",Font.BOLD,14));



        JLabel clock = new JLabel();

        clock.setForeground(Color.WHITE);

        clock.setFont(new Font("Segoe UI",Font.PLAIN,14));



        Timer timer = new Timer(1000,e->{

            clock.setText(

                    LocalTime.now()

                            .format(

                                    DateTimeFormatter.ofPattern("hh:mm:ss a")

                            )

            );

        });

        timer.start();



        rightPanel.add(status);

        rightPanel.add(clock);



        header.add(titlePanel, BorderLayout.CENTER);

        header.add(rightPanel, BorderLayout.EAST);



        add(header,BorderLayout.NORTH);

        // ================= QUICK SUGGESTION PANEL =================

JPanel suggestionPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,10,10));

suggestionPanel.setBackground(new Color(28,32,38));

String[] suggestions = {
        "Java",
        "HTML",
        "CSS",
        "SQL",
        "AI",
        "Git"
};

for(String topic : suggestions){

    JButton button = new JButton(topic);

    button.setFocusPainted(false);

    button.setCursor(new Cursor(Cursor.HAND_CURSOR));

    button.setBackground(Color.WHITE);

button.setForeground(new Color(30,30,30));

button.setBorder(BorderFactory.createLineBorder(new Color(220,220,220),1));

    button.setFont(new Font("Segoe UI", Font.BOLD, 15));

button.setPreferredSize(new Dimension(70,35));

    button.addActionListener(e->{

        inputField.setText(topic);

        sendMessage();

    });

    suggestionPanel.add(button);

}

             // ================= CHAT PANEL =================

chatPanel = new JPanel();

chatPanel.setLayout(new BoxLayout(chatPanel, BoxLayout.Y_AXIS));

chatPanel.setBackground(new Color(28,32,38));

chatPanel.setBorder(new EmptyBorder(20,20,20,20));

scrollPane = new JScrollPane(chatPanel);

scrollPane.setBorder(BorderFactory.createEmptyBorder());

scrollPane.getVerticalScrollBar().setUnitIncrement(16);

JPanel centerPanel = new JPanel(new BorderLayout());

centerPanel.add(suggestionPanel, BorderLayout.NORTH);

centerPanel.add(scrollPane, BorderLayout.CENTER);

add(centerPanel, BorderLayout.CENTER);

    // ================= RIGHT STATUS PANEL =================

        JPanel statusPanel = new JPanel();

        statusPanel.setPreferredSize(new Dimension(230,0));

        statusPanel.setBackground(new Color(33,37,41));

        statusPanel.setLayout(new BoxLayout(statusPanel,BoxLayout.Y_AXIS));

        statusPanel.setBorder(new EmptyBorder(20,20,20,20));



        JLabel botTitle = new JLabel("BOT STATUS");

        botTitle.setFont(new Font("Segoe UI",Font.BOLD,18));

        botTitle.setForeground(Color.WHITE);

        statusPanel.add(botTitle);

        statusPanel.add(Box.createVerticalStrut(25));



        statusPanel.add(createStatusLabel("Status : Online"));

        statusPanel.add(Box.createVerticalStrut(15));



        statusPanel.add(createStatusLabel("Knowledge Base"));

        statusPanel.add(Box.createVerticalStrut(10));

questionCountLabel =
        createStatusLabel("Questions Asked : 0");

statusPanel.add(questionCountLabel);

        statusPanel.add(createStatusLabel("100+ FAQs"));

        statusPanel.add(Box.createVerticalStrut(15));



        statusPanel.add(createStatusLabel("Technology"));

        statusPanel.add(createStatusLabel("Java + NLP"));

        statusPanel.add(Box.createVerticalStrut(15));



        statusPanel.add(createStatusLabel("Response Time"));

        statusPanel.add(createStatusLabel("< 1 Second"));

        statusPanel.add(Box.createVerticalStrut(15));



        statusPanel.add(createStatusLabel("Version"));

        statusPanel.add(createStatusLabel("1.0"));



        add(statusPanel,BorderLayout.EAST);

                // ================= WELCOME MESSAGE =================

        appendBotMessage(

                "Hello! Welcome to Artificial Intelligence Chatbot.\n\n"

+ "I am your Java NLP Assistant.\n\n"

+ "You can ask me questions about:\n\n"

+ "- Java\n"

+ "- HTML\n"

+ "- CSS\n"

+ "- JavaScript\n"

+ "- SQL\n"

+ "- Spring Boot\n"

+ "- Git & GitHub\n"

+ "- Artificial Intelligence\n"

+ "- Machine Learning\n"

+ "- Interview Questions\n"

+ "- Resume Preparation\n\n"

+ "Click a suggestion above or type your own question below."

        );

                // ================= BOTTOM PANEL =================

        JPanel bottomPanel = new JPanel(new BorderLayout(10,10));

        bottomPanel.setBackground(new Color(24,26,27));

        bottomPanel.setBorder(new EmptyBorder(15,15,15,15));



        inputField = new JTextField();

        inputField.setBackground(new Color(40,40,40));

        inputField.setForeground(Color.WHITE);

        inputField.setCaretColor(Color.WHITE);

        inputField.setBorder(BorderFactory.createEmptyBorder(10,15,10,15));

        inputField.setFont(new Font("Segoe UI",Font.PLAIN,16));

        inputField.setPreferredSize(new Dimension(450,45));

        inputField.setToolTipText("Ask any programming question...");



        bottomPanel.add(inputField,BorderLayout.CENTER);



        JPanel buttonPanel = new JPanel(new GridLayout(1,3,10,0));

        buttonPanel.setBackground(new Color(240,242,245));

                // SEND BUTTON

        sendButton = new JButton("Send");

        sendButton.setFont(new Font("Segoe UI",Font.BOLD,15));

        sendButton.setBackground(new Color(25,135,84));

        sendButton.setForeground(Color.WHITE);

        sendButton.setFocusPainted(false);

        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {

    public void mouseEntered(java.awt.event.MouseEvent evt) {

        sendButton.setBackground(new Color(20,110,70));

    }

    public void mouseExited(java.awt.event.MouseEvent evt) {

        sendButton.setBackground(new Color(25,135,84));

    }

});

        // CLEAR BUTTON

        clearButton = new JButton("Clear");

        clearButton.setFont(new Font("Segoe UI",Font.BOLD,15));

        clearButton.setBackground(new Color(255,193,7));

        clearButton.setForeground(Color.BLACK);

        clearButton.setFocusPainted(false);

        // EXIT BUTTON

        exitButton = new JButton("Exit");

        exitButton.setFont(new Font("Segoe UI",Font.BOLD,15));

        exitButton.setBackground(new Color(220,53,69));

        exitButton.setForeground(Color.WHITE);

        exitButton.setFocusPainted(false);



        buttonPanel.add(sendButton);

        buttonPanel.add(clearButton);

        buttonPanel.add(exitButton);



        bottomPanel.add(buttonPanel,BorderLayout.EAST);



        add(bottomPanel,BorderLayout.SOUTH);

        // ================= ACTIONS =================

        sendButton.addActionListener(e -> sendMessage());

        inputField.addActionListener(e -> sendMessage());

clearButton.addActionListener(e -> {

    chatPanel.removeAll();

    chatPanel.revalidate();

    chatPanel.repaint();

    appendBotMessage("Chat history cleared successfully.");

});

        exitButton.addActionListener(e -> System.exit(0));



       SwingUtilities.invokeLater(() -> inputField.requestFocusInWindow());

    }

 private void appendBotMessage(String message) {

    JPanel outerPanel = new JPanel();
    outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.Y_AXIS));
    outerPanel.setBackground(new Color(28,32,38));
    outerPanel.setAlignmentX(Component.LEFT_ALIGNMENT);

    JLabel title = new JLabel(
            "🤖 AI Assistant   "
            + LocalTime.now().format(
                    DateTimeFormatter.ofPattern("hh:mm a"))
    );

    title.setForeground(new Color(0,255,170));
    title.setFont(new Font("Segoe UI", Font.BOLD, 13));
    title.setAlignmentX(Component.LEFT_ALIGNMENT);
    title.setBorder(new EmptyBorder(5,10,5,0));

    JLabel bubble = new JLabel(
            "<html><div style='width:320px;padding:12px;'>"
                    + message.replace("\n","<br>")
                    + "</div></html>"
    );

    
    bubble.setOpaque(true);
    bubble.setBackground(new Color(45,55,72));
    bubble.setForeground(Color.WHITE);
    bubble.setFont(new Font("Segoe UI", Font.PLAIN,15));

    bubble.setBorder(
            BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(60,70,90)),
                    new EmptyBorder(10,15,10,15)
            )
    );

    RoundedPanel bubbleContainer = new RoundedPanel(
        new Color(45,55,72),
        25
);

bubbleContainer.setLayout(new BorderLayout());

bubbleContainer.setBorder(
        new EmptyBorder(8,12,8,12)
);

bubble.setOpaque(false);

bubbleContainer.add(bubble);

    JPanel bubblePanel = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
    bubblePanel.setBackground(new Color(28,32,38));
    bubblePanel.setAlignmentX(Component.LEFT_ALIGNMENT);
    bubblePanel.add(bubbleContainer);

    outerPanel.add(title);
    outerPanel.add(bubblePanel);

    chatPanel.add(outerPanel);
    chatPanel.revalidate();
    chatPanel.repaint();

SwingUtilities.invokeLater(() -> {
    JScrollBar bar = scrollPane.getVerticalScrollBar();
    bar.setValue(bar.getMaximum());
});

    chatPanel.add(outerPanel);

chatPanel.revalidate();
chatPanel.repaint();

SwingUtilities.invokeLater(() -> {
    JScrollBar bar = scrollPane.getVerticalScrollBar();
    bar.setValue(bar.getMaximum());
});
}
// ================= STATUS LABEL =================

private JLabel createStatusLabel(String text) {

    JLabel label = new JLabel(text);

    label.setForeground(Color.WHITE);

    label.setFont(new Font("Segoe UI", Font.PLAIN, 14));

    label.setBorder(new EmptyBorder(2,0,2,0));

    return label;

}

// ================= SEND MESSAGE =================

private void sendMessage() {

    String userMessage = inputField.getText().trim();

    if(userMessage.isEmpty()){

        return;

    }

    JPanel outerPanel = new JPanel();
outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.Y_AXIS));
outerPanel.setBackground(new Color(28,32,38));
outerPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);

JLabel title = new JLabel(
        "👤 You   " +
        LocalTime.now().format(
                DateTimeFormatter.ofPattern("hh:mm a"))
);

title.setForeground(new Color(100,200,255));
title.setFont(new Font("Segoe UI", Font.BOLD,13));
title.setAlignmentX(Component.RIGHT_ALIGNMENT);

JPanel messagePanel = new JPanel(
        new FlowLayout(FlowLayout.RIGHT,0,0)
);

messagePanel.setBackground(new Color(28,32,38));

JLabel bubble = new JLabel(

"<html><div style='width:300px;padding:12px;'>"

+ userMessage.replace("\n","<br>")

+ "</div></html>"

);

RoundedPanel userBubbleContainer = new RoundedPanel(
        new Color(0,120,215),
        25
);

userBubbleContainer.setLayout(new BorderLayout());

userBubbleContainer.setBorder(
        new EmptyBorder(8,12,8,12)
);

bubble.setOpaque(false);

userBubbleContainer.add(bubble);

bubble.setOpaque(true);

bubble.setBackground(new Color(0,120,215));

bubble.setForeground(Color.WHITE);

bubble.setFont(new Font("Segoe UI",Font.PLAIN,15));

bubble.setBorder(

BorderFactory.createCompoundBorder(

BorderFactory.createLineBorder(

new Color(0,90,180)

),

new EmptyBorder(10,15,10,15)

)

);

messagePanel.add(userBubbleContainer);

outerPanel.add(title);

outerPanel.add(messagePanel);

chatPanel.add(outerPanel);

    inputField.setText("");

   // Show typing message

appendBotMessage("Typing");

new javax.swing.Timer(800, e -> {

    ((Timer)e.getSource()).stop();

    // Remove the "Typing..." bubble
    chatPanel.remove(chatPanel.getComponentCount() - 1);

    Response response = bot.getResponse(userMessage);

    appendBotMessage(response.getMessage());

    totalQuestions++;

    questionCountLabel.setText(
            "Questions Asked : " + totalQuestions
    );

    chatPanel.revalidate();

    chatPanel.repaint();

}).start();

}

}