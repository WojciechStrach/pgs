package com.pgs.javadev;

public class XmasTreeCreator {

    StringBuilder build = new StringBuilder();

    private void drawTree(String text, int levels, int currentLevel, int direction) {
        if (direction == 1) {
            for (int i = 1; i < levels - currentLevel; i++) {
                build.append(" ");
            }
            for (int i = 0; i < 2 * currentLevel + 1; i++) {
                build.append(text);
            }
        }
        if (direction == 2) {
            for (int i = 0; i < currentLevel; i++) {
                build.append(" ");
            }
            for (int i = levels; i > 2 * currentLevel + 1; i--) {
                build.append(text);
            }
        }
        if (direction == 3) {
            if(levels>currentLevel){
                for(int i=1; i<levels-currentLevel; i++){
                    build.append(" ");
                }
            }else{
                for(int i=levels-1; i<currentLevel; i++){
                    build.append(" ");
                }
            }
            if(levels>currentLevel){
                for(int i=0; i<currentLevel; i++){
                    build.append(text);
                }
            }else{
                for(int i=levels-2; i>currentLevel-levels; i--){
                    build.append(text);
                }
            }
        }
        if(direction == 4){
            if(levels>currentLevel){
                for(int i=0; i<currentLevel; i++){
                    build.append(text);
                }
            }else{
                for(int i=levels; i>currentLevel-levels; i--){
                    build.append(text);
                }
            }
        }

    }

    public String createXmasTree(String text, int levels, int direction) {
        if (direction == 1 || direction == 2) {
            for (int i = 0; i < levels; i++) {
                if (i >= 1) {
                    build.append("\n");
                }
                drawTree(text, levels, i, direction);
            }
        } else {
            for (int i = 0; i < 2 * levels; i++) {
                build.append("\n");
                drawTree(text, levels, i, direction);
            }
        }
        String string = build.toString();
        return string;

    }

}
