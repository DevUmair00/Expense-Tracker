export const LineChartData = {
  labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
  datasets: [
    {
      label: "Monthly Expense",
      labelPosition: "bottom",
      data: [3000, 2180, 3900, 1245, 323, 5430, 6090, 2300, 4300, 1200, 800, 1300],
      
      // Line styling
      borderColor: "rgba(171, 174, 177)", // Modern indigo theme
      borderWidth: 2,
      tension: 0.4, // Smooth bezier curves instead of sharp angles
      
      // Area fill styling
      fill: true,
      backgroundColor: "rgba(99, 102, 241, 0.1)", // Soft background accent
      
      // Data point styling
      pointRadius: 3,
      pointHoverRadius: 7,
      pointBackgroundColor: "rgba(171, 174, 177)",
      pointBorderWidth: 2,
      pointHoverBackgroundColor: "#4f46e5",
      pointHoverBorderColor: "#ffffff",
      pointHoverBorderWidth: 3,
    },
  ],
};

export const chartOptions = {
  responsive: true,
  plugins: {
    legend: {
      position: 'bottom', // Moves dataset labels (e.g., "Monthly Expense") below the chart
      labels: {
        padding: 20, // Adds space between the chart area and the legend
      },
    },
  },
  scales: {
    x: {
      position: 'bottom', // Ensures X-axis labels (Jan, Feb, etc.) stay at the bottom
    },
  },
};