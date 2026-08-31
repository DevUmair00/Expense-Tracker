import {Pie} from "react-chartjs-2";
import {PieChartData} from "./PieChartData"
import {chartOptions} from "./PieChartData"

import {
  Chart as ChartJS , 
  Tooltip , 
  Legend , 
  ArcElement
} from "chart.js";

ChartJS.register(
  Tooltip , 
  Legend , 
  ArcElement,
);

const PieChart = () => {

  return (
      <Pie options={chartOptions} data={PieChartData} />
  )
}

export default PieChart