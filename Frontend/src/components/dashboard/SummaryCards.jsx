import Card from "./Card";
import { Wallet , TrendingUp , TrendingDown , PiggyBank } from "lucide-react";

const SummaryCards = () => {
  const cards = [
    {
      title: "Total Balance",
      value: "$24,250",
      change: "12.5%",
      icon: Wallet,
    },
    {
      title: "Total Income",
      value: "$48,750",
      change: "8.3%",
      icon: TrendingUp,
    },
    {
      title: "Total Expense",
      value: "$20,750",
      change: "8.3%",
      icon: TrendingDown,
    },
    {
      title: "Monthly Saving",
      value: "$4,00",
      change: "8.3%",
      icon: PiggyBank,
    },
  ];

  return (
    <div className="grid grid-cols-1 lg:grid-cols-2 xl:grid-cols-4 py-14 gap-6">
      {cards.map((card, index) => (
        <Card
          key={index}
          title={card.title}
          value={card.value}
          change={card.change}
          icon={card.icon}
        />
      ))}
    </div>
  );
};

export default SummaryCards;


