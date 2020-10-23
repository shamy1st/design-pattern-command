# Command Design Pattern (Java Implementation)

**Command** object is used to encapsulate all information needed to perform an action at a later time. ([wiki](https://en.wikipedia.org/wiki/Command_pattern))
![](https://github.com/shamy1st/design-pattern-command-java/blob/main/command-uml.png)
### Problem: 
You have GUI **Button** and you want to separate **click action** from Button implementation.

    public class Button {
        private String label;

        public void click() {
            //You don't know the action at the time of Button implementation!
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }

### Solution:
![](https://github.com/shamy1st/design-pattern-command-java/blob/main/command-solution-uml.png)
