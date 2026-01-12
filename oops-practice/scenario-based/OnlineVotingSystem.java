class DuplicateVoteException extends Exception {
    public DuplicateVoteException(String msg) {
        super(msg);
    }
}

abstract class ElectionService {
    public abstract void castVote(Voter voter, Candidate candidate) throws DuplicateVoteException;
    public abstract void showResults();
}

class Voter {
    private String id;
    private String name;
    private boolean hasVoted;
    
    public Voter(String id, String name) {
        this.id = id;
        this.name = name;
        this.hasVoted = false;
    }
    
    public String getId() {
        return id;
    }
    
    public boolean hasVoted() {
        return hasVoted;
    }
    
    public void setVoted() {
        this.hasVoted = true;
    }
}

class Candidate {
    private String name;
    private String party;
    private int votes;
    
    public Candidate(String name, String party) {
        this.name = name;
        this.party = party;
        this.votes = 0;
    }
    
    public String getName() {
        return name;
    }
    
    public void addVote() {
        votes++;
    }
    
    public int getVotes() {
        return votes;
    }
}

class Election extends ElectionService {
    private Candidate[] candidates = new Candidate[5];
    private int count = 0;
    
    public void addCandidate(Candidate c) {
        candidates[count++] = c;
    }
    
    public void castVote(Voter voter, Candidate candidate) throws DuplicateVoteException {
        if(voter.hasVoted()) {
            throw new DuplicateVoteException("Already voted");
        }
        candidate.addVote();
        voter.setVoted();
        System.out.println("Vote casted");
    }
    
    public void showResults() {
        System.out.println("\n--- Results ---");
        for(int i = 0; i < count; i++) {
            System.out.println(candidates[i].getName() + ": " + candidates[i].getVotes());
        }
    }
}

public class OnlineVotingSystem {
    public static void main(String[] args) {
        Election election = new Election();
        
        Candidate c1 = new Candidate("Rajesh", "Party A");
        Candidate c2 = new Candidate("Priya", "Party B");
        election.addCandidate(c1);
        election.addCandidate(c2);
        
        Voter v1 = new Voter("V001", "Amit");
        Voter v2 = new Voter("V002", "Sneha");
        
        try {
            election.castVote(v1, c1);
            election.castVote(v2, c2);
            election.castVote(v1, c2); // duplicate
        } catch(DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }
        
        election.showResults();
    }
}