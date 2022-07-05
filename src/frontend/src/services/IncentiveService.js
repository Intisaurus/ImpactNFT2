import axios from 'axios';

const INCENTIVE_API_BASE_URL = 'http://localhost:8080/api/incentives';

class IncentiveService{

    getIncentives(){
        return axios.get(INCENTIVE_API_BASE_URL);
    }
}

export default new IncentiveService();