package Week14.ExtracreditProject.Win_or_loss;

public class Team {
        // TODO: Declare private fields - name, wins, losses
        private String name;
        private int wins, losses;

        // TODO: Define mutator methods -
        //       setName(), setWins(), setLosses()
        public void setName(String namer)
        {
            this.name = namer;
        }

        public void setWins(int winner)
        {
            this.wins = winner;
        }

        public void setLosses(int loser)
        {
            this.losses = loser;
        }

        // TODO: Define accessor methods -
        //       getName(), getWins(), getLosses()
        public String getName()
        {
            return name;
        }
        public int getWins()
        {
            return wins;
        }

        public int getLosses()
        {
            return losses;
        }

        // TODO: Define getWinPercentage()
        public double getWinPercentage()
        {
            return (double) getWins() / (getWins() + getLosses());
        }

        // TODO: Define printStanding()
        public void printStanding()
        {
            System.out.printf("Win percentage: %.2f\n", getWinPercentage());


            //A team has a winning average if the win percentage is 0.5 or greater.
            if(getWinPercentage() >= 0.5)
            {
                System.out.println("Congratulations, Team " + getName() + " has a winning average!");

            }else
            {
                System.out.println("Team " + getName() + " has a losing average");
            }

        }

    }

