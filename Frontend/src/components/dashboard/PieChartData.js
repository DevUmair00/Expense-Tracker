export const PieChartData = {
  labels: ["Food", "Transport", "Shopping", "Bills", "Entertainment"],

  datasets: [
    {
      label: "Expense by Category",
      data: [3000, 2180, 3900, 1245, 323],

      backgroundColor: [
        "rgba(99, 102, 241, 0.7)",
        "rgba(34, 197, 94, 0.7)",
        "rgba(239, 68, 68, 0.7)",
        "rgba(234, 179, 8, 0.7)",
        "rgba(168, 85, 247, 0.7)",
      ],

      hoverOffset: 4,
    },
  ],
};

export const chartOptions = {
  responsive: true,
  maintainAspectRatio: false,

  plugins: {
    legend: {
      position: "bottom",
      labels: {
        padding: 4,
      },
    },
  },
};