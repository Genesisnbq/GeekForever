package _02_Java_Object_Oriented_Programming._33_StringClass.newAI;

public class Ai {
    public String answer(String question) { //给answer一个public就行啦, 通过answer访问其他 方法
        String res = handleCanStart(question);
        if (res != null) {
            return res;
        }
        res = handleAskTail(question);
        if (res != null) {
            return res;
        }
        return handleUnknown(question);
    }

    private String handleCanStart(String question) {
        String[] canStart = new String[]{"会", "能", "有", "敢", "在"};
        for (String s : canStart) {
            if (question.startsWith(s)) {
                return s + "!";
            }
        }
        return null;
    }

    private String handleAskTail(String question) {
        String[] askTail = new String[]{"吗?", "吗", "吗？"};
        for (String s : askTail) {
            if (question.endsWith(s)) {
                return question.replace(s, "!");
            }
        }
        return null;
    }

    private String handleUnknown(String question) {
        return question + "!";
    }
}
