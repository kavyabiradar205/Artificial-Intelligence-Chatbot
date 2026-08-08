import java.util.HashMap;
import java.util.Set;

public class KnowledgeBase {

    private HashMap<String, String> knowledge;

    public KnowledgeBase() {

    knowledge = new HashMap<>();

    loadGreetings();
    loadJava();
    loadHTML();
    loadCSS();
    loadSQL();
    loadAI();
    loadGit();

    System.out.println("AI Loaded = " + knowledge.containsKey("ai"));
System.out.println("Git Loaded = " + knowledge.containsKey("git"));

   System.out.println(knowledge.containsKey("ai"));
System.out.println(knowledge.containsKey("machine learning"));
System.out.println(knowledge.containsKey("future of ai"));

}

private void loadGreetings() {

    knowledge.put("hello",
            "👋 Hello!\n\nWelcome to Artificial Intelligence Chatbot.\n\nI can help you learn:\n\n• Java\n• HTML\n• CSS\n• SQL\n• AI\n• Git\n\nType a topic to begin.");

    knowledge.put("hi",
            "👋 Hi!\n\nAsk me anything about Java, HTML, CSS, SQL, AI or Git.");

    knowledge.put("hey",
            "👋 Hey!\n\nI'm your AI learning assistant.");

}

private void loadJava() {

    knowledge.put("java",
            "========== JAVA ==========\n\n"

            + "Definition:\n"
            + "Java is a high-level, object-oriented programming language developed by Sun Microsystems in 1995.\n\n"

            + "Features:\n"
            + "• Object Oriented\n"
            + "• Platform Independent\n"
            + "• Secure\n"
            + "• Robust\n"
            + "• Multithreading\n"
            + "• Portable\n\n"

            + "Applications:\n"
            + "• Android Apps\n"
            + "• Banking Software\n"
            + "• Web Applications\n"
            + "• Enterprise Software\n"
            + "• Desktop Applications\n\n"

            + "Ask me:\n"
            + "• features of java\n"
            + "• advantages of java\n"
            + "• jdk\n"
            + "• jre\n"
            + "• jvm\n"
            + "• oops\n");

    knowledge.put("features of java",
            "Features of Java:\n\n"
            + "1. Object Oriented\n"
            + "2. Platform Independent\n"
            + "3. Secure\n"
            + "4. Robust\n"
            + "5. Portable\n"
            + "6. Multithreaded\n"
            + "7. High Performance\n"
            + "8. Dynamic");

    knowledge.put("advantages of java",
            "Advantages of Java:\n\n"
            + "• Write Once Run Anywhere\n"
            + "• Easy to Learn\n"
            + "• Secure\n"
            + "• Large Community\n"
            + "• Rich Libraries\n"
            + "• Excellent for Enterprise Applications");

    knowledge.put("jdk",
            "JDK (Java Development Kit)\n\n"
            + "Used for developing Java programs.\n\n"
            + "Contains:\n"
            + "• JRE\n"
            + "• Compiler (javac)\n"
            + "• Debugger\n"
            + "• Development Tools");

    knowledge.put("jre",
            "JRE (Java Runtime Environment)\n\n"
            + "Used to run Java programs.\n\n"
            + "Contains:\n"
            + "• JVM\n"
            + "• Java Libraries");

    knowledge.put("jvm",
            "JVM (Java Virtual Machine)\n\n"
            + "Converts bytecode into machine code.\n\n"
            + "Responsibilities:\n"
            + "• Memory Management\n"
            + "• Garbage Collection\n"
            + "• Platform Independence");

    knowledge.put("oops",
            "OOP Concepts:\n\n"
            + "1. Class\n"
            + "2. Object\n"
            + "3. Encapsulation\n"
            + "4. Inheritance\n"
            + "5. Polymorphism\n"
            + "6. Abstraction");

}
private void loadHTML() {

    knowledge.put("html",
            "================ HTML ================\n\n"

            + "Definition:\n"
            + "HTML (HyperText Markup Language) is the standard markup language used to create webpages.\n\n"

            + "History:\n"
            + "HTML was created by Tim Berners-Lee in 1991.\n\n"

            + "Features:\n"
            + "• Easy to Learn\n"
            + "• Platform Independent\n"
            + "• Supports Multimedia\n"
            + "• Works with CSS and JavaScript\n"
            + "• Supported by all browsers\n\n"

            + "Applications:\n"
            + "• Web Pages\n"
            + "• Portfolio Websites\n"
            + "• Forms\n"
            + "• Blogs\n"
            + "• E-commerce Websites\n\n"

            + "Ask me:\n"
            + "• html tags\n"
            + "• html forms\n"
            + "• html table\n"
            + "• html lists\n"
            + "• semantic tags\n"
            + "• html5\n"
            + "• html interview questions");

    knowledge.put("html tags",
    "HTML Tags:\n\n"
    + "• &lt;html&gt; → Root element\n"
    + "• &lt;head&gt; → Metadata\n"
    + "• &lt;title&gt; → Page title\n"
    + "• &lt;body&gt; → Visible content\n"
    + "• &lt;h1&gt; to &lt;h6&gt; → Headings\n"
    + "• &lt;p&gt; → Paragraph\n"
    + "• &lt;br&gt; → Line Break\n"
    + "• &lt;hr&gt; → Horizontal Line\n"
    + "• &lt;img&gt; → Image\n"
    + "• &lt;a&gt; → Hyperlink");

    knowledge.put("html forms",
            "HTML Forms:\n\n"
            + "Forms are used to collect user input.\n\n"
            + "Common Elements:\n"
            + "• input\n"
            + "• label\n"
            + "• textarea\n"
            + "• select\n"
            + "• option\n"
            + "• button");

    knowledge.put("html table",
        "================ HTML TABLE ================\n\n"

        + "Definition:\n"
        + "HTML tables are used to display data in rows and columns.\n\n"

        + "Important Tags:\n"
        + "• &lt;table&gt; → Creates a table\n"
        + "• &lt;tr&gt; → Defines a table row\n"
        + "• &lt;th&gt; → Defines a table heading\n"
        + "• &lt;td&gt; → Defines table data\n"
        + "• &lt;caption&gt; → Adds a table title\n"
        + "• &lt;thead&gt; → Groups table header\n"
        + "• &lt;tbody&gt; → Groups table body\n"
        + "• &lt;tfoot&gt; → Groups table footer\n\n"

        + "Example:\n\n"

        + "&lt;table border='1'&gt;\n"
        + "   &lt;tr&gt;\n"
        + "      &lt;th&gt;Name&lt;/th&gt;\n"
        + "      &lt;th&gt;Age&lt;/th&gt;\n"
        + "   &lt;/tr&gt;\n"
        + "   &lt;tr&gt;\n"
        + "      &lt;td&gt;Kavya&lt;/td&gt;\n"
        + "      &lt;td&gt;21&lt;/td&gt;\n"
        + "   &lt;/tr&gt;\n"
        + "&lt;/table&gt;\n\n"

        + "Attributes:\n"
        + "• border\n"
        + "• cellpadding\n"
        + "• cellspacing\n"
        + "• rowspan\n"
        + "• colspan\n"
        + "• width\n"
        + "• height\n\n"

        + "Interview Questions:\n"
        + "1. What is an HTML table?\n"
        + "2. Difference between &lt;th&gt; and &lt;td&gt;?\n"
        + "3. What is rowspan?\n"
        + "4. What is colspan?\n"
        + "5. Difference between thead, tbody and tfoot?");

    knowledge.put("html lists",
            "HTML Lists:\n\n"
            + "1. Ordered List (<ol>)\n"
            + "2. Unordered List (<ul>)\n"
            + "3. Description List (<dl>)");

    knowledge.put("html tags",
        "HTML Tags:\n\n"
        + "• &lt;html&gt; → Root element\n"
        + "• &lt;head&gt; → Metadata\n"
        + "• &lt;title&gt; → Page title\n"
        + "• &lt;body&gt; → Visible content\n"
        + "• &lt;h1&gt; to &lt;h6&gt; → Headings\n"
        + "• &lt;p&gt; → Paragraph\n"
        + "• &lt;br&gt; → Line Break\n"
        + "• &lt;hr&gt; → Horizontal Line\n"
        + "• &lt;img&gt; → Image\n"
        + "• &lt;a&gt; → Hyperlink");

    knowledge.put("html5",
            "HTML5 Features:\n\n"
            + "• Audio\n"
            + "• Video\n"
            + "• Canvas\n"
            + "• SVG\n"
            + "• Local Storage\n"
            + "• Semantic Elements");

    knowledge.put("html interview questions",
            "Top HTML Interview Questions:\n\n"
            + "1. What is HTML?\n"
            + "2. Difference between HTML and HTML5?\n"
            + "3. What are semantic tags?\n"
            + "4. Difference between div and span?\n"
            + "5. What are forms?\n"
            + "6. What are lists?\n"
            + "7. Difference between id and class?\n"
            + "8. What is iframe?\n"
            + "9. What is DOCTYPE?\n"
            + "10. Difference between block and inline elements?");

}

private void loadCSS() {

    knowledge.put("css",
            "============= CSS =============\n\n"
            + "CSS (Cascading Style Sheets) is used to style HTML webpages.\n\n"
            + "Features:\n"
            + "• Colors\n"
            + "• Fonts\n"
            + "• Layouts\n"
            + "• Animations\n"
            + "• Responsive Design\n\n"
            + "Applications:\n"
            + "• Website Styling\n"
            + "• Mobile Responsive Design\n"
            + "• UI Design\n\n"
            + "Ask me:\n"
            + "• css selectors\n"
            + "• css box model\n"
            + "• css flexbox\n"
            + "• css grid\n"
            + "• css positions\n"
            + "• css animation\n"
            + "• css interview questions");

    knowledge.put("css selectors",
            "CSS Selectors:\n\n"
            + "1. Element Selector (p)\n"
            + "2. Class Selector (.class)\n"
            + "3. ID Selector (#id)\n"
            + "4. Universal Selector (*)\n"
            + "5. Group Selector (h1,p)\n"
            + "6. Attribute Selector\n"
            + "7. Pseudo Class (:hover)\n"
            + "8. Pseudo Element (::before)");

    knowledge.put("css box model",
            "CSS Box Model:\n\n"
            + "Every HTML element consists of:\n\n"
            + "• Content\n"
            + "• Padding\n"
            + "• Border\n"
            + "• Margin\n\n"
            + "Total Width = Content + Padding + Border + Margin");

    knowledge.put("css flexbox",
            "CSS Flexbox:\n\n"
            + "Flexbox is a one-dimensional layout system.\n\n"
            + "Important Properties:\n"
            + "• display:flex\n"
            + "• flex-direction\n"
            + "• justify-content\n"
            + "• align-items\n"
            + "• flex-wrap\n"
            + "• gap");

    knowledge.put("css grid",
            "CSS Grid:\n\n"
            + "Grid is a two-dimensional layout system.\n\n"
            + "Important Properties:\n"
            + "• display:grid\n"
            + "• grid-template-columns\n"
            + "• grid-template-rows\n"
            + "• grid-gap\n"
            + "• grid-column\n"
            + "• grid-row");

    knowledge.put("css positions",
            "CSS Positions:\n\n"
            + "1. Static\n"
            + "2. Relative\n"
            + "3. Absolute\n"
            + "4. Fixed\n"
            + "5. Sticky");

    knowledge.put("css animation",
            "CSS Animation:\n\n"
            + "Animations make webpages interactive.\n\n"
            + "Important Properties:\n"
            + "• @keyframes\n"
            + "• animation-name\n"
            + "• animation-duration\n"
            + "• animation-delay\n"
            + "• animation-iteration-count\n"
            + "• animation-timing-function");

    knowledge.put("css interview questions",
            "Top CSS Interview Questions:\n\n"
            + "1. What is CSS?\n"
            + "2. Types of CSS?\n"
            + "3. Difference between ID and Class?\n"
            + "4. What is Box Model?\n"
            + "5. What is Flexbox?\n"
            + "6. What is Grid?\n"
            + "7. Difference between Relative and Absolute?\n"
            + "8. What is z-index?\n"
            + "9. What are pseudo classes?\n"
            + "10. What is Responsive Design?");
}

private void loadSQL() {

    knowledge.put("sql",
            "========== SQL ==========\n\n"

            + "Definition:\n"
            + "SQL (Structured Query Language) is used to store, retrieve, update and delete data from relational databases.\n\n"

            + "Applications:\n"
            + "• Banking Systems\n"
            + "• E-Commerce\n"
            + "• Hospital Management\n"
            + "• Student Management\n"
            + "• Inventory Systems\n\n"

            + "Types of SQL Commands:\n"
            + "• DDL\n"
            + "• DML\n"
            + "• DQL\n"
            + "• DCL\n"
            + "• TCL\n\n"

            + "Ask me:\n"
            + "• sql commands\n"
            + "• ddl\n"
            + "• dml\n"
            + "• dql\n"
            + "• joins\n"
            + "• primary key\n"
            + "• foreign key\n"
            + "• normalization\n"
            + "• sql interview questions");



    knowledge.put("sql commands",

            "SQL Commands:\n\n"

            + "1. DDL - Data Definition Language\n"

            + "2. DML - Data Manipulation Language\n"

            + "3. DQL - Data Query Language\n"

            + "4. DCL - Data Control Language\n"

            + "5. TCL - Transaction Control Language");



    knowledge.put("ddl",

            "DDL (Data Definition Language)\n\n"

            + "Used to define database structure.\n\n"

            + "Commands:\n"

            + "• CREATE\n"

            + "• ALTER\n"

            + "• DROP\n"

            + "• TRUNCATE\n"

            + "• RENAME");



    knowledge.put("dml",

            "DML (Data Manipulation Language)\n\n"

            + "Used to modify table data.\n\n"

            + "Commands:\n"

            + "• INSERT\n"

            + "• UPDATE\n"

            + "• DELETE");



    knowledge.put("dql",

            "DQL (Data Query Language)\n\n"

            + "SELECT command is used to retrieve data.\n\n"

            + "Example:\n"

            + "SELECT * FROM Employee;");



    knowledge.put("joins",

            "SQL Joins:\n\n"

            + "• INNER JOIN\n"

            + "• LEFT JOIN\n"

            + "• RIGHT JOIN\n"

            + "• FULL OUTER JOIN\n"

            + "• SELF JOIN\n"

            + "• CROSS JOIN");



    knowledge.put("primary key",

            "Primary Key:\n\n"

            + "• Uniquely identifies each row.\n"

            + "• Cannot contain NULL values.\n"

            + "• Only one Primary Key per table.");



    knowledge.put("foreign key",

            "Foreign Key:\n\n"

            + "• Creates relationship between two tables.\n"

            + "• References Primary Key of another table.\n"

            + "• Duplicate values are allowed.");



    knowledge.put("normalization",

            "Normalization:\n\n"

            + "Purpose:\n"

            + "• Reduce data redundancy.\n"

            + "• Improve database design.\n\n"

            + "Normal Forms:\n"

            + "1NF\n"

            + "2NF\n"

            + "3NF\n"

            + "BCNF");



    knowledge.put("sql interview questions",

            "Top SQL Interview Questions:\n\n"

            + "1. What is SQL?\n"

            + "2. Difference between DELETE, DROP and TRUNCATE?\n"

            + "3. What is Primary Key?\n"

            + "4. What is Foreign Key?\n"

            + "5. What are Joins?\n"

            + "6. Difference between WHERE and HAVING?\n"

            + "7. Difference between CHAR and VARCHAR?\n"

            + "8. What is Normalization?\n"

            + "9. What is GROUP BY?\n"

            + "10. What is ORDER BY?");

}

private void loadAI() {

    knowledge.put("ai",
            "========== ARTIFICIAL INTELLIGENCE ==========\n\n"
            + "Artificial Intelligence (AI) is the simulation of human intelligence by machines.\n\n"
            + "AI enables computers to:\n"
            + "• Learn\n"
            + "• Think\n"
            + "• Solve Problems\n"
            + "• Make Decisions\n"
            + "• Understand Language\n\n"
            + "Applications:\n"
            + "• Chatbots\n"
            + "• Robotics\n"
            + "• Self Driving Cars\n"
            + "• Face Recognition\n"
            + "• Healthcare\n"
            + "• Banking\n"
            + "• Agriculture\n"
            + "• Cyber Security\n\n"
            + "Ask me:\n"
            + "• types of ai\n"
            + "• machine learning\n"
            + "• deep learning\n"
            + "• neural network\n"
            + "• supervised learning\n"
            + "• unsupervised learning\n"
            + "• reinforcement learning\n"
            + "• ai applications\n"
            + "• ai advantages\n"
            + "• ai disadvantages\n"
            + "• future of ai\n"
            + "• robotics\n"
            + "• ai interview questions");

    knowledge.put("types of ai",
            "Types of Artificial Intelligence:\n\n"
            + "1. Narrow AI (Weak AI)\n"
            + "2. General AI (Strong AI)\n"
            + "3. Super AI\n\n"
            + "Today, almost all AI systems are Narrow AI.");

    knowledge.put("machine learning",
            "Machine Learning (ML):\n\n"
            + "Machine Learning is a subset of AI.\n"
            + "It enables computers to learn from data without being explicitly programmed.\n\n"
            + "Examples:\n"
            + "• Spam Detection\n"
            + "• Movie Recommendation\n"
            + "• Fraud Detection\n"
            + "• Price Prediction");

    knowledge.put("deep learning",
            "Deep Learning:\n\n"
            + "Deep Learning is a subset of Machine Learning.\n"
            + "It uses Artificial Neural Networks with multiple hidden layers.\n\n"
            + "Applications:\n"
            + "• Image Recognition\n"
            + "• Speech Recognition\n"
            + "• ChatGPT\n"
            + "• Self Driving Cars");

    knowledge.put("neural network",
            "Artificial Neural Network (ANN):\n\n"
            + "ANN is inspired by the human brain.\n\n"
            + "Main Layers:\n"
            + "• Input Layer\n"
            + "• Hidden Layer\n"
            + "• Output Layer");

    knowledge.put("supervised learning",
            "Supervised Learning:\n\n"
            + "Uses labelled data.\n\n"
            + "Examples:\n"
            + "• House Price Prediction\n"
            + "• Email Spam Detection\n"
            + "• Student Result Prediction");

    knowledge.put("unsupervised learning",
            "Unsupervised Learning:\n\n"
            + "Uses unlabeled data.\n\n"
            + "Examples:\n"
            + "• Customer Segmentation\n"
            + "• Pattern Recognition\n"
            + "• Market Basket Analysis");

    knowledge.put("reinforcement learning",
            "Reinforcement Learning:\n\n"
            + "The AI agent learns by receiving rewards and penalties.\n\n"
            + "Applications:\n"
            + "• Robotics\n"
            + "• Self Driving Cars\n"
            + "• Chess AI\n"
            + "• Game Playing");

    knowledge.put("ai applications",
            "Applications of AI:\n\n"
            + "• Healthcare\n"
            + "• Banking\n"
            + "• Education\n"
            + "• Agriculture\n"
            + "• Manufacturing\n"
            + "• Robotics\n"
            + "• Cyber Security\n"
            + "• Smart Assistants");

    knowledge.put("ai advantages",
            "Advantages of AI:\n\n"
            + "• Reduces Human Errors\n"
            + "• Fast Decision Making\n"
            + "• Automation\n"
            + "• 24x7 Availability\n"
            + "• High Accuracy\n"
            + "• Increased Productivity");

    knowledge.put("ai disadvantages",
            "Disadvantages of AI:\n\n"
            + "• Expensive\n"
            + "• Job Replacement\n"
            + "• Privacy Issues\n"
            + "• Requires Large Data\n"
            + "• No Human Emotions");

    knowledge.put("future of ai",
            "Future of AI:\n\n"
            + "AI will transform:\n"
            + "• Healthcare\n"
            + "• Education\n"
            + "• Transportation\n"
            + "• Banking\n"
            + "• Agriculture\n"
            + "• Space Research\n\n"
            + "Future technologies include:\n"
            + "• Generative AI\n"
            + "• Humanoid Robots\n"
            + "• Autonomous Vehicles\n"
            + "• AI Assistants");

    knowledge.put("robotics",
            "Robotics:\n\n"
            + "Robotics combines AI, sensors and mechanical engineering to build intelligent robots.\n\n"
            + "Applications:\n"
            + "• Manufacturing\n"
            + "• Medical Surgery\n"
            + "• Space Exploration\n"
            + "• Military\n"
            + "• Agriculture");

    knowledge.put("ai interview questions",
            "Top AI Interview Questions:\n\n"
            + "1. What is Artificial Intelligence?\n"
            + "2. Difference between AI and Machine Learning?\n"
            + "3. What is Deep Learning?\n"
            + "4. Explain Neural Networks.\n"
            + "5. Types of AI?\n"
            + "6. What is Supervised Learning?\n"
            + "7. What is Unsupervised Learning?\n"
            + "8. What is Reinforcement Learning?\n"
            + "9. Applications of AI?\n"
            + "10. Advantages and Disadvantages of AI?");
}

private void loadGit() {

    knowledge.put("git",
            "========== GIT ==========\n\n"

            + "Definition:\n"
            + "Git is a distributed version control system used to track changes in source code and collaborate with developers.\n\n"

            + "Features:\n"
            + "• Version Control\n"
            + "• Branching\n"
            + "• Merging\n"
            + "• Collaboration\n"
            + "• Fast Performance\n\n"

            + "Applications:\n"
            + "• Software Development\n"
            + "• Team Collaboration\n"
            + "• Source Code Management\n\n"

            + "Ask me:\n"
            + "• git commands\n"
            + "• git workflow\n"
            + "• github\n"
            + "• branch\n"
            + "• merge\n"
            + "• commit\n"
            + "• clone\n"
            + "• push\n"
            + "• pull\n"
            + "• git interview questions");



    knowledge.put("git commands",

            "Important Git Commands:\n\n"

            + "git init\n"

            + "git status\n"

            + "git add\n"

            + "git commit\n"

            + "git log\n"

            + "git branch\n"

            + "git checkout\n"

            + "git merge\n"

            + "git clone\n"

            + "git pull\n"

            + "git push");



    knowledge.put("git workflow",

            "Git Workflow:\n\n"

            + "1. git init\n"

            + "2. git add .\n"

            + "3. git commit -m \"message\"\n"

            + "4. git branch -M main\n"

            + "5. git remote add origin URL\n"

            + "6. git push -u origin main");



    knowledge.put("github",

            "GitHub:\n\n"

            + "GitHub is a cloud platform used to host Git repositories.\n\n"

            + "Features:\n"

            + "• Repository Hosting\n"

            + "• Pull Requests\n"

            + "• Issues\n"

            + "• GitHub Actions\n"

            + "• GitHub Pages");



    knowledge.put("branch",

            "Git Branch:\n\n"

            + "A branch is an independent line of development.\n\n"

            + "Commands:\n"

            + "git branch\n"

            + "git branch branchName\n"

            + "git checkout branchName");



    knowledge.put("merge",

            "Git Merge:\n\n"

            + "Merge combines changes from one branch into another.\n\n"

            + "Command:\n"

            + "git merge branchName");



    knowledge.put("commit",

            "Git Commit:\n\n"

            + "A commit saves the current changes permanently.\n\n"

            + "Command:\n"

            + "git commit -m \"Initial Commit\"");



    knowledge.put("clone",

            "Git Clone:\n\n"

            + "Downloads an existing Git repository.\n\n"

            + "Command:\n"

            + "git clone repositoryURL");



    knowledge.put("push",

            "Git Push:\n\n"

            + "Uploads local commits to GitHub.\n\n"

            + "Command:\n"

            + "git push origin main");



    knowledge.put("pull",

            "Git Pull:\n\n"

            + "Downloads latest changes from GitHub.\n\n"

            + "Command:\n"

            + "git pull origin main");



    knowledge.put("git interview questions",

            "Top Git Interview Questions:\n\n"

            + "1. What is Git?\n"

            + "2. Difference between Git and GitHub?\n"

            + "3. What is a Repository?\n"

            + "4. What is a Commit?\n"

            + "5. What is Branching?\n"

            + "6. What is Merge?\n"

            + "7. Difference between Pull and Fetch?\n"

            + "8. Difference between Clone and Fork?\n"

            + "9. What is HEAD?\n"

            + "10. Explain Git Workflow.");
}


    public String getResponse(String keyword) {
        return knowledge.get(keyword);
    }

    public Set<String> getKeywords() {
        return knowledge.keySet();
    }

}
