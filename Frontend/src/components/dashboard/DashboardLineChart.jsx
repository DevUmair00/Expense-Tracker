import {Line} from "react-chartjs-2"
import { LineChartData } from "./LineChartData";
import {chartOptions} from "./LineChartData"

import {
  Chart as ChartJS, 
  CategoryScale,
  LinearScale,
  LineElement,
  PointElement,
  Legend,
  Title,
  Tooltip
} from "chart.js";

ChartJS.register(
  CategoryScale,
  LinearScale,
  LineElement,
  PointElement,
  Legend,
  Title,
  Tooltip
);


const DashboardLineChart = () => {
  
  return (
      <Line options={chartOptions} data={LineChartData} />
  )
}

export default DashboardLineChart