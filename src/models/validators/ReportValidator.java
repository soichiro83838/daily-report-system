package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        String commutingtime_error = _validateCommutingtime(r.getCommutingtime());
        if(!commutingtime_error.equals("")) {
            errors.add(commutingtime_error);
        }

        String leavingtime_error = _validateLeavingtime(r.getLeavingtime());
        if(!leavingtime_error.equals("")) {
            errors.add(leavingtime_error);
        }

        return errors;
    }

    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }

    private static String _validateCommutingtime(String commutingtime) {
        if(commutingtime == null || commutingtime.equals("")) {
            return "出勤時間を入力してください。";
        }

        return "";
    }

    private static String _validateLeavingtime(String leavingtime) {
        if(leavingtime == null || leavingtime.equals("")) {
            return "退勤時間を入力してください。";
        }

        return "";
    }
}